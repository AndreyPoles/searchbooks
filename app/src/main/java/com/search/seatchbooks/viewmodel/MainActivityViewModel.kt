package com.search.seatchbooks.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.search.seatchbooks.network.ApiRetroBooksService
import com.search.seatchbooks.network.Books
import com.search.seatchbooks.network.BooksRetroInstance
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivityViewModel: ViewModel() {
    lateinit var bookList: MutableLiveData<Books>
    init {
        bookList = MutableLiveData()
    }

    fun getBookListObserver(): MutableLiveData<Books> {
        return bookList
    }

    fun makeApiCall(query: String) {

        val retroInstance  = BooksRetroInstance.getRetroInstance().create(ApiRetroBooksService::class.java)
        retroInstance.getBookListFromApi(query)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(getBookListObserverRx())
    }

    private fun getBookListObserverRx():Observer<Books> {
        return object :Observer<Books>{
            override fun onComplete() {
                //hide progress indicator .
            }

            override fun onError(e: Throwable) {
                bookList.postValue(null)
            }

            override fun onNext(t: Books) {
                bookList.postValue(t)
            }

            override fun onSubscribe(d: Disposable) {
                //start showing progress indicator.
            }
        }
    }
}
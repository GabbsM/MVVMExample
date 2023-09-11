package com.gaby.examplemvvm.data

import com.gaby.examplemvvm.data.model.QuoteModel
import com.gaby.examplemvvm.data.model.QuoteProvider
import com.gaby.examplemvvm.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}
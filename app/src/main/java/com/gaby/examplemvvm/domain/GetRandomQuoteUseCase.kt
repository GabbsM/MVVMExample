package com.gaby.examplemvvm.domain

import com.gaby.examplemvvm.data.model.QuoteModel
import com.gaby.examplemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    operator fun invoke(): QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}
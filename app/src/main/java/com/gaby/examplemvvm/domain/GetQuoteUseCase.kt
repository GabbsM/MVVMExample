package com.gaby.examplemvvm.domain

import com.gaby.examplemvvm.data.QuoteRepository
import com.gaby.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()
    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}
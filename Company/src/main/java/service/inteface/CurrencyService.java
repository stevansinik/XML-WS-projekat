package service.inteface;

import java.util.Collection;

import data.entity.Currency;

public interface CurrencyService {
	Currency create(Currency currency);
	Currency readById(Integer id);
	Collection<Currency> readAll();
}

package service.implementation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.entity.Currency;
import data.repository.CurrencyRepository;
import service.inteface.CurrencyService;


@Service
public class CurrencyServiceImpl implements CurrencyService{

	@Autowired
	private CurrencyRepository currencyRepo;
	
	@Override
	public Currency create(Currency currency) {
		Currency savedCurrency = currencyRepo.save(currency);
		return savedCurrency;
	}

	@Override
	public Currency readById(Integer id) {
		Currency readCurrency = currencyRepo.findOne(id);
		return readCurrency;
	}

	@Override
	public Collection<Currency> readAll() {
		Collection<Currency> allCurrencies = currencyRepo.findAll();
		return allCurrencies;
	}
	
}

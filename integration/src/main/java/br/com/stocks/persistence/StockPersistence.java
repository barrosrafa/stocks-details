package br.com.stocks.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stocks.adapter.StockAdapter;
import br.com.stocks.dto.CompanyClassDTO;
import br.com.stocks.repository.CompanyRepository;

@Service
public class StockPersistence implements StockAdapter {

	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public List<CompanyClassDTO> findStocks(Integer idCompany) {
		return companyRepository.fetchStocksInnerJoin(idCompany);
	}
}

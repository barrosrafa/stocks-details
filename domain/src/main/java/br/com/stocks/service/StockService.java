package br.com.stocks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stocks.adapter.StockAdapter;
import br.com.stocks.dto.CompanyClassDTO;

@Service
public class StockService {

	@Autowired
	private StockAdapter stockAdapter;
	
	public List<CompanyClassDTO> fetchCompanyDataInnerJoin() {
		return stockAdapter.findStocks(1);
	}
}
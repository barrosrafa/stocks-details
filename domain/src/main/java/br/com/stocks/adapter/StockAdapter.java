package br.com.stocks.adapter;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.stocks.dto.CompanyClassDTO;

@Service
public interface StockAdapter {

	public List<CompanyClassDTO> findStocks(Integer idCompany);
}

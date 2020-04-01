package br.com.stocks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.stocks.dto.CompanyClassDTO;
import br.com.stocks.service.StockService;

@RequestMapping("/stocks")
@RestController
public class StockController {
	
	@Autowired
	private StockService stockService;

	@GetMapping
	public List<CompanyClassDTO> find() {
		return stockService.fetchCompanyDataInnerJoin();
	}
}

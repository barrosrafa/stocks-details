package br.com.stocks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.stocks.dto.CompanyClassDTO;
import br.com.stocks.entity.CompanyEntity;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {
	@Query("SELECT distinct new br.com.stocks.dto.CompanyClassDTO(c.code, c.name, cl.code) "
			+ "FROM CompanyEntity c JOIN c.classes cl where c.id=:idCompany")
	List<CompanyClassDTO> fetchStocksInnerJoin(@Param("idCompany") Integer idCompany);
}

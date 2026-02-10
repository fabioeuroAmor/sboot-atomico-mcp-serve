package br.com.ati.repository;

import br.com.ati.domain.SellerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public  interface  SellerAccountRepository  extends JpaRepository<SellerAccount, Integer> {

    /**
     * Busca todas as contas de vendedor por nome
     * @param name Nome da conta do vendedor
     * @return Lista de contas de vendedor
     */
    List<SellerAccount> findByName (String name) ;

    /**
     * Busca todas as contas de vendedor por proprietário
     * @param owner Proprietário da conta do vendedor
     * @return Lista de contas de vendedor
     */
    List<SellerAccount> findByOwner (String owner) ;
}
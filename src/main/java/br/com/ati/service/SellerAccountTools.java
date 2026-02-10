package br.com.ati.service;

import br.com.ati.domain.SellerAccount;
import br.com.ati.repository.SellerAccountRepository;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class  SellerAccountTools {
    private  final SellerAccountRepository sellerAccountRepository;

    public  SellerAccountTools (SellerAccountRepository sellerAccountRepository) {
        this .sellerAccountRepository = sellerAccountRepository;
    }

    /**
     * Busca todas as contas de vendedor por nome
     * @param name Nome da conta do vendedor
     * @return Lista de contas de vendedor
     */
    @Tool(name = "Buscar conta de vendedor por nome", description = "Encontrar todas as contas de vendedor por nome")
    public String getAccountByName ( @ToolParam(description = "Nome da conta do vendedor") String name) {
        List<SellerAccount> accountList = sellerAccountRepository.findByName(name);
        StringBuilder  result  =  new  StringBuilder ();
        for (SellerAccount account : accountList) {
            result.append(account.toString()).append( "\n" );
        }
        return result.toString();
    }

    /**
     * Busca todas as contas de vendedor por proprietário
     * @param name Proprietário da conta de vendedor
     * @return Lista de contas de vendedor
     */
    @Tool(name = "Buscar todas as contas de vendedor por proprietário", description = "Encontrar todas as contas de vendedor por proprietário")
    public String getAccountByOwner (@ToolParam(description = "Proprietário da conta de vendedor") String owner) {
        List<SellerAccount> accountList = sellerAccountRepository.findByOwner(owner);
        StringBuilder  result  =  new  StringBuilder ();
        for (SellerAccount account : accountList) {
            result.append(account.toString()).append( "\n" );
        }
        return result.toString();
    }
}
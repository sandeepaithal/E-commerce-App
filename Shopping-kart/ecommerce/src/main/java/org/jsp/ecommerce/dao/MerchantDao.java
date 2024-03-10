package org.jsp.ecommerce.dao;

import org.jsp.ecommerce.model.Merchant;
import java.util.Optional;
import org.jsp.ecommerce.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {
    @Autowired
    private MerchantRepository merchantRepository;

    public Merchant savMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }
    public Merchant updateMerchant(Merchant merchant){
        return merchantRepository.save(merchant);
    }
    public Optional<Merchant> verify(String email, String password) {
		return merchantRepository.verify(email, password);
	}
    public Optional<Merchant> verify(long phone, String password) {
		return merchantRepository.verify(phone, password);
	}
}

package ru.example.springbootrest.service.credit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.springbootrest.entity.CreditEntity;
import ru.example.springbootrest.repository.CreditRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CreditServiceImpl implements CreditService{

    private final CreditRepository creditRepository;
    public CreditServiceImpl(CreditRepository creditRepository) {
        this.creditRepository = creditRepository;
    }

    public CreditEntity createCredit (CreditEntity creditEntity) {
        return creditRepository.save(creditEntity);
    }

    public List<CreditEntity> findAllCredits () {
        return creditRepository.findAll();
    }

    public CreditEntity findCreditById (Integer id) {
        return creditRepository.findById(id).orElse(null);
    }
}

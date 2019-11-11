package ru.example.springbootrest.service.credit;

import ru.example.springbootrest.entity.CreditEntity;

import java.util.List;

public interface CreditService {
    CreditEntity createCredit (CreditEntity creditEntity);
    List<CreditEntity> findAllCredits ();
    CreditEntity findCreditById (Integer id);
}

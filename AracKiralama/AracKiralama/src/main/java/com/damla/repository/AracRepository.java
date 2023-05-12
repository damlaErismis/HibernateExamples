package com.damla.repository;

import com.damla.entity.Arac;
import com.damla.util.MyFactoryRepository;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public class AracRepository extends MyFactoryRepository<Arac, Long> {
    public AracRepository(){
        super(new Arac());
    }


    public List<Arac> findBYMarkaAndModel(String marka, String model) {
        openSession();
        CriteriaQuery<Arac> criteria = getCriteriaBuilder().createQuery(Arac.class);
        Root<Arac> root =criteria.from(Arac.class);
        criteria.select(root);
        criteria.where(getCriteriaBuilder().equal(root.get("marka"), marka),
                getCriteriaBuilder().equal(root.get("model"),model));
        List<Arac> result = getEntityManager().createQuery(criteria).getResultList();
        closeSession();
        if (result.isEmpty()){
            System.out.println("Araç Bulunamadı!");
            return null;
        }
        return result;



    }
}

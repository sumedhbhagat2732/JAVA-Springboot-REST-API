package com.liveasy.api.Loadservice;

import com.liveasy.api.model.Loads;
import com.liveasy.api.repository.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LoadServiceimpl implements LoadService {
    @Autowired
    private LoadRepository loadRepository;

    @Override
    public String addLoad(@RequestBody Loads load) {
        loadRepository.save(load);
        return "loads details added successfully ";
    }

    @Override
    public Loads updateLoad(Loads load) {
        loadRepository.save(load);
        return load;
    }

    @Override
    public List<Loads> getLoad() {
        return loadRepository.findAll();

    }

    // @Override
    // public List<Loads> findByShipperId(String shipperId) {
    //     return loadRepository.findByShipperId(shipperId);
    // }
    // @Override
    // public void deleteLoad(String shipperId) {
    //     loadRepository.deleteById(shipperId);
}













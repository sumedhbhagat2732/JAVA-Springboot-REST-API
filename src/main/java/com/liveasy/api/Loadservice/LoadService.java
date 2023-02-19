package com.liveasy.api.Loadservice;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.liveasy.api.model.Loads;

public interface LoadService {
    List<Loads> getLoad();

    default String addLoad() {
        return addLoad(null);
    }

    String addLoad(@RequestBody Loads load);

//    Loads getLoads(long shipperId);

//    void deleteLoad(long parseLong);

    public Loads updateLoad(@RequestBody Loads load);

    // List<Loads> findByShipperId(String shipperId);

    // void deleteLoad(String shipperId);
}

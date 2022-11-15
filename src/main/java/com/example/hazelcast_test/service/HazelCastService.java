package com.example.hazelcast_test.service;

import com.example.hazelcast_test.interfaces.ClusterManager;
import com.hazelcast.cluster.Member;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HazelCastService implements ClusterManager {
    private HazelcastInstance instance;

    public HazelCastService(){
        Config conf = new Config();
        instance = Hazelcast.newHazelcastInstance(conf);
    }

    @Override
    public boolean amITheLeader() {
        Member oldestMember = instance.getCluster()
                .getMembers().iterator().next();
        return oldestMember.localMember();
    }
}
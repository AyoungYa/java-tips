package com.ayoungya.consensusAlgorithm.paxos;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/9.</p>
 */
public class MainClass {
    private static final int CAPTAIN_SIZE = 5;
    private static final int MEMBER_SIZE = 25;

    public static void main(String[] args) {
        List<Acceptor> captainList = new ArrayList<>();
        for (int i = 0; i < CAPTAIN_SIZE; i++) {
            captainList.add(new Acceptor());
        }

        List<Proposer> memberList = new ArrayList<>();
        for (int i = 0; i < MEMBER_SIZE; i++) {
            memberList.add(new Proposer());
        }
    }
}

package com.ayoungya.consensusAlgorithm.paxos;

import java.util.Random;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/9.</p>
 */
public class Proposer {
    private Destination wantGoTo;
    private int sleepTime;

    public Proposer() {
        sleepTime = new Random().nextInt(20);
        int randomDestination = new Random().nextInt(3);
        switch (randomDestination) {
            case 0:
                wantGoTo = Destination.LA_SHA;
                break;
            case 1:
                wantGoTo = Destination.KUN_MING;
                break;
            case 2:
                wantGoTo = Destination.GUANG_ZHOU;
                break;
            default:
                wantGoTo = Destination.GUANG_ZHOU;
        }
    }

    public void askAcceptor(Acceptor acceptor, Proposal proposal) {
//        Destination tmpDestination = acceptor.answerProposer(this, proposal);
    }
}

package com.ayoungya.consensusAlgorithm.paxos;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/9.</p>
 */
public class Acceptor {
    private long lastTime;
    private Destination lastDestination;

//    public Optional<Destination> answerProposer(Proposer proposer, Proposal proposal) {
//        Optional<Destination> result;
//        if (proposal.getTime() > lastTime) {
//            result = Optional.of(proposal.getDestination());
//        } else {
//            return this.lastDestination;
//        }
//    }


    public long getLastTime() {
        return lastTime;
    }

    public void setLastTime(long lastTime) {
        this.lastTime = lastTime;
    }

    public Destination getLastDestination() {
        return lastDestination;
    }

    public void setLastDestination(Destination lastDestination) {
        this.lastDestination = lastDestination;
    }
}

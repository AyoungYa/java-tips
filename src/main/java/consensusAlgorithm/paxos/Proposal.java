package consensusAlgorithm.paxos;

/**
 * <p>Description: 提案</p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2018/5/9.</p>
 */
public class Proposal {
    private Destination destination; //提议的目的
    private long time;  //提议时间
    private Proposer proposer; //提议人

    public Proposal() {
    }

    public Proposal(Destination destination, long time, Proposer proposer) {
        this.destination = destination;
        this.time = time;
        this.proposer = proposer;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Proposer getProposer() {
        return proposer;
    }

    public void setProposer(Proposer proposer) {
        this.proposer = proposer;
    }
}

public class DuplamenteNode {

    private Integer info;
    private DuplamenteNode next;
    private DuplamenteNode ant;

    public DuplamenteNode(Integer info) {
        this.info = info;
        this.next = null;
        this.ant = null;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public DuplamenteNode getNext() {
        return next;
    }

    public void setNext(DuplamenteNode next) {
        this.next = next;
    }

    public DuplamenteNode getAnt() {
        return ant;
    }

    public void setAnt(DuplamenteNode ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        return "DuplamenteNode{" +
                "info=" + info +
                ", next=" + next +
                '}';
    }
}

package access.Ex;

public class MaxCounter {
    private int count;
    private int max;

    MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행로직
        count++;

    }

    public int getCount() {
        return count;
    }
}


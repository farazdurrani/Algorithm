package random;

import java.util.List;

public class MaxTrail {
    public static void main(String[] args) {
	List<Integer> list = List.of(4, 3, 2, 1); // expected -1
	System.out.println(maxTrailing(list));
	list = List.of(7, 2, 3, 10, 2, 4, 8, 1); // expected 8
	System.out.println(maxTrailing(list));
    }
    
    public static int maxTrailing(List<Integer> levels) {
	if (isDescSorted(levels)) {
	    return -1;
	}
	int maxDif = -1;
	for (int i = 0; i < levels.size(); i++) {
	    int dif = -1;
	    for (int j = i; j < levels.size(); j++) {
		dif = levels.get(j) - levels.get(i);
		if (dif > maxDif) {
		    maxDif = dif;
		    if(j != 0 && j % 30 == 0 && isDescSorted(levels.subList(j, levels.size()))) {
			return maxDif;
		    }
		}
	    }
	}
	return maxDif;
    }

    public static int maxTrailing4(List<Integer> levels) {
	if (isDescSorted(levels)) {
	    return -1;
	}
	int maxDif = maxSubArray(levels, 0, levels.size() - 1);
	return maxDif;
    }

    private static int maxSubArray(List<Integer> levels, int low, int high) {
	if (low == high) {
	    return levels.get(low);
	} else {
	    int mid = (low + high) /2;
	    int l = maxSubArray(levels, low, mid);
	    int r = maxSubArray(levels, mid + 1, high);
	    int cm = maxSubArrayCrossingMid(levels, low, mid, high);
	    if (l >= r && l >= cm) {
		return l;
	    } else if (r >= l && r >= cm) {
		return r;
	    } else {
		return cm;
	    }
	}
    }

    private static int maxSubArrayCrossingMid(List<Integer> levels, int low, int mid,
        int high) {
	int maxDif = Integer.MIN_VALUE;
	for(int i = low; i <= mid; i++) {
	    int dif = -1;
	    for (int j = i; j <=  mid; j++) {
		dif = levels.get(j) - levels.get(i);
		if (dif > maxDif) {
		    maxDif = dif;
		}
	    }
	}
	for(int j = mid + 1; j <= high; j++) {
	    int dif = -1;
	    for (int k = j; k <=  high; k++) {
		dif = levels.get(k) - levels.get(j);
		if (dif > maxDif) {
		    maxDif = dif;
		}
	    }
	}
	return maxDif;
    }

    public static int maxTrailing3(List<Integer> levels) {
	if (isDescSorted(levels)) {
	    return -1;
	}
	int maxDif = -1;
	for (int i = 0; i < levels.size(); i++) {
	    int dif = -1;
	    for (int j = i; j < levels.size(); j++) {
		dif = levels.get(j) - levels.get(i);
		if (dif > maxDif) {
		    maxDif = dif;
		}
	    }
	}
	return maxDif;
    }

    private static boolean isDescSorted(List<Integer> levels) {
	for (int i = 1; i < levels.size(); i++) {
	    if (levels.get(i) > levels.get(i - 1)) {
		return false;
	    }
	}
	return true;
    }

    public static int maxTrailing2(List<Integer> levels) {
	if (isDescSorted(levels)) {
	    return -1;
	}
	int maxDif = -1;
	for (int i = 0; i < levels.size(); i++) {
	    int dif = -1;
	    for (int j = i; j < levels.size(); j++) {
		if (levels.get(j) < levels.get(i)) {
		    continue;
		} else if (j > 0) {
		    dif = levels.get(j) - levels.get(i);
		    if (dif > maxDif) {
			maxDif = dif;
		    }
		}
	    }
	}
	return maxDif;
    }
}

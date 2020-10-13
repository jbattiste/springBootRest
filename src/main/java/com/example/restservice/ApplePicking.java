package com.example.restservice;

import java.util.ArrayList;

public class ApplePicking {

	private final long stint_a;
	private final long stint_b;

	// Calculate the maximum number of apples
	public long Calculate(long stint_a, long stint_b)
	{
		ArrayList<AppleTotals> apple_totals;
		apple_totals = new ArrayList<AppleTotals>();
		AppleTotals totals = new AppleTotals();
		totals.setStint_a(stint_a);
		totals.setStint_b(stint_b);
		totals.setTotal_a(stint_a);
		totals.setTotal_a(10);

		return totals.getTotal();
	}

	public ApplePicking(long stint_b, long stint_a) {
		this.stint_b = stint_b;
		this.stint_a = stint_a;
	}

	public long getAlice() {
		return stint_a;
	}

	public long getKenith() {
		return stint_b;
	}

	public long getTotal() {
		return Calculate(stint_a, stint_b);
	}
}

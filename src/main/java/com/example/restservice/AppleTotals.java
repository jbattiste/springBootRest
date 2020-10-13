package com.example.restservice;

public class AppleTotals {

	// tally the
	private long total_a = 0;
	private long total_b = 0;
	private long stint_a = 0;
	private long stint_b = 0;

	public long getTotal_a() {
		return total_a;
	}
	public void setTotal_a(long total_a)
	{
		this.total_a = total_a;
	}

	public long getTotal_b() {
		return total_b;
	}
	public void setTotal_b(long total_b)
	{
		this.total_b = total_b;
	}

	public long getStint_a() {
		return stint_a;
	}
	public void setStint_a(long stint_a)
	{
		this.stint_a = stint_a;
	}

	public long getStint_b() {
		return stint_b;
	}
	public void setStint_b(long stint_b)
	{
		this.stint_b = stint_b;
	}

	public long getTotal()
	{
		return this.total_a + this.total_b;
	}
}

package com.example.task03;
/**
 * Интервал в миллисекундах
 */
public class Milliseconds implements TimeUnit
{
    private final long amount;

    public Milliseconds(long amount)
    {
        this.amount = amount;
    }

    @Override
    public long toMillis()
    {
        return amount;
    }

    @Override
    public long toSeconds()
    {
        return Math.round(amount / 1000f);
    }

    @Override
    public long toMinutes()
    {
        return Math.round(amount / 60000f);
    }

    @Override
    public long toHours()
    {
        return Math.round(amount / 3600000f);
    }
}
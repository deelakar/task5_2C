package sit707_week5;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class FakeClock extends Clock {

    private Instant instant;
    private ZoneId zone;

    public FakeClock(Instant instant, ZoneId zone) {
        this.instant = instant;
        this.zone = zone;
    }

    @Override
    public ZoneId getZone() {
        return zone;
    }

    @Override
    public Clock withZone(ZoneId zone) {
        return new FakeClock(instant, zone);
    }

    @Override
    public Instant instant() {
        return instant;
    }
}

package phu.quang.le.data;

import java.util.List;

import phu.quang.le.models.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}

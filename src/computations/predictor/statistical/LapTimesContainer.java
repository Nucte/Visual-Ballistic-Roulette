package computations.predictor.statistical;

import java.util.ArrayList;
import java.util.List;

/**
 * Only for the ball now. Comparable to an order book.
 */
class LapTimesContainer
{
	@Override
	public String toString()
	{
		return "LapTimesContainer [revolutionTimes=" + revolutionTimes + "]";
	}

	List<Double> revolutionTimes = new ArrayList<>();

	public double getAverage()
	{
		double result = 0.0;
		if (!revolutionTimes.isEmpty())
		{
			for (Double revolutionTime : revolutionTimes)
			{
				result += revolutionTime;
			}
			result /= revolutionTimes.size();
		}
		return result;
	}
}

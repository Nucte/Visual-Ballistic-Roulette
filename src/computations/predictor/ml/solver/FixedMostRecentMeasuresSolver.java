package computations.predictor.ml.solver;

import java.util.List;

import computations.Constants;
import computations.predictor.OutcomeStatistics;
import computations.predictor.ml.PredictorMachineLearning;
import computations.predictor.ml.model.DataRecord;
import utils.logger.Logger;

public class FixedMostRecentMeasuresSolver implements PredictorSolver
{
	public int predict(PredictorMachineLearning predictor, List<Double> ballLapTimes, List<Double> wheelLapTimes)
	{
		List<DataRecord> predictRecords = getPredictedRecords(predictor, ballLapTimes, wheelLapTimes);
		List<Integer> mostProbableNumberList = mostProbableNumberForEachRecord(predictRecords);

		int size = mostProbableNumberList.size();
		int par = Constants.RECORDS_COUNT_FOR_PREDICTION;
		if (size >= par)
		{
			mostProbableNumberList = mostProbableNumberList.subList(size - par, size);
		}

		OutcomeStatistics os = OutcomeStatistics.create(mostProbableNumberList);
		int mostProbableFinalNumber = os.meanNumber;
		Logger.traceDEBUG("(final) Most probable number : " + mostProbableFinalNumber);
		return os.meanNumber;
	}

}

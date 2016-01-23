package computations;

import computations.predictor.ml.model.solver.ComplexWeightingSchemeSolver;
import computations.predictor.ml.model.solver.OutcomeSolver;
import computations.predictor.ml.solver.FixedMostRecentMeasuresSolver;
import computations.predictor.ml.solver.PredictorSolver;
import computations.wheel.Wheel.WheelWay;

public class Constants
{
	/**
	 * TODO: To be measured
	 */
	// METERS
	private static final double WHEEL_DIAMETER = 0.60;
	private static final double CASE_DIAMETER = 0.80;

	public static final double WHEEL_CIRCUMFERENCE = WHEEL_DIAMETER * Math.PI;
	public static final double BALL_CIRCUMFERENCE = CASE_DIAMETER * Math.PI;

	public static final long THRESHOLD_BEFORE_NEW_SESSION_IN_MS = 30 * 1000;

	// Machine Learning
	public static int NUMBER_OF_NEIGHBORS_KNN = 4;
	public static int RECORDS_COUNT_FOR_PREDICTION = 5;
	public static PredictorSolver PREDICTOR_SOLVER = new FixedMostRecentMeasuresSolver();
	public static OutcomeSolver DATARECORD_SOLVER = new ComplexWeightingSchemeSolver();

	// Physics
	public static double CUTOFF_SPEED = 1.10; // m/s
	public static int DEFAULT_SHIFT_PHASE = 18; // Check +/- 9

	public static final int REGION_HALF_SIZE = 3; // Region is 3+1+3 = 7.

	public static final int MIN_NUMBER_OF_WHEEL_TIMES_BEFORE_PREDICTION = 2;
	public static final int MIN_NUMBER_OF_BALL_TIMES_BEFORE_PREDICTION = 3;

	public static final String ERRORLEVEL_PROCESS_EXCEPTION_TAG = "-1";
	static final String ERRORLEVEL_SESSION_NOT_READY_STRING = "SESSION_NOT_READY_WHEEL_COUNT_ACTUAL";

	public static final WheelWay DEFAULT_WHEEL_WAY = WheelWay.ANTICLOCKWISE;

	public static final String DATABASE_NAME = "roulette_db";

}
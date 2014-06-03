package tid.pce.computingEngine.algorithms.wson;

import java.util.concurrent.Callable;

import tid.pce.computingEngine.ComputingRequest;
import tid.pce.computingEngine.ComputingResponse;
import tid.pce.computingEngine.algorithms.ComputingAlgorithm;
import tid.pce.computingEngine.algorithms.ComputingAlgorithmManager;
import tid.pce.computingEngine.algorithms.ComputingAlgorithmPreComputation;
import tid.pce.computingEngine.algorithms.multiLayer.OperationsCounter;
import tid.pce.server.wson.ReservationManager;
import tid.pce.tedb.TEDB;

public class KSP_SPREAD_AlgorithmManager implements ComputingAlgorithmManager{
	
	KSP_SPREAD_AlgorithmPreComputation preComp;
	
	private ReservationManager reservationManager;
	
	public ComputingAlgorithm getComputingAlgorithm(
			ComputingRequest pathReq, TEDB ted) {
		KSP_SPREAD_Algorithm algo = new KSP_SPREAD_Algorithm(pathReq, ted,reservationManager);
		algo.setPreComp(preComp);		
		return algo;
	}

	public void setReservationManager(ReservationManager reservationManager) {
		this.reservationManager=reservationManager;
		
	}

	public void setPreComputation(ComputingAlgorithmPreComputation pc) {
		// TODO Auto-generated method stub
		this.preComp=(KSP_SPREAD_AlgorithmPreComputation) pc;		
	
	}

	@Override
	public ComputingAlgorithm getComputingAlgorithm(ComputingRequest pathReq,
			TEDB ted, OperationsCounter OPcounter) {
		// TODO Auto-generated method stub
		return null;
	}


}

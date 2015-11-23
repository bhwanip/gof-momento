package com.gof.momento;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class MomentoManager {

	public static volatile MomentoManager _instance;

	
	private final Deque<EmpMomento> que = new ConcurrentLinkedDeque<EmpMomento>();

	public void addMomento(EmpMomento momento) {
		que.push(momento);
	}

	public EmpMomento getLatestMomento() {
		return que.pop();
	}

	public static MomentoManager get() {
		if(_instance == null){
			synchronized (MomentoManager.class) {
				if(_instance == null)
					_instance = new MomentoManager();
			}
		}
		return _instance;
	}


}

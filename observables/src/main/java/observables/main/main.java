package observables.main;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class main {

	public static void main(String[] args) {
        Observable<String> observable = Observable.just("Mensaje 1","Mensaje 2","Mensaje 3");

        Observer<String> observer1 = new Observer<String>() {
            public void onNext(String text) {
                System.out.println("Observer 1 received text: " + text);
            }

            public void onError(Throwable e) {
                System.out.println("Observer 1 received error: " + e.getMessage());
            }

            public void onComplete() {
                System.out.println("Observer 1 received complete event");
            }
			public void onSubscribe(Disposable arg0) {
				System.out.println("Observer 1 subscribed");
			}
        };

        Observer<String> observer2 = new Observer<String>() {

            public void onNext(String text) {
                System.out.println("Observer 2 received text: " + text);
            }

            public void onError(Throwable e) {
                System.out.println("Observer 2 received error: " + e.getMessage());
            }

            public void onComplete() {
                System.out.println("Observer 2 received complete event");
            }

			public void onSubscribe(Disposable arg0) {
				System.out.println("Observer 2 subscribed");
			}
        };

        observable.subscribe(observer1);
        observable.subscribe(observer2);

	}

}

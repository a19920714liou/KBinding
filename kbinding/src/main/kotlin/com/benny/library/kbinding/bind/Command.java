package com.benny.library.kbinding.bind;

import rx.functions.Action1;

/**
 * Created by benny on 12/16/15.
 */

public interface Command {
     void execute(Object param, Action1<? super Boolean> canExecute);
}

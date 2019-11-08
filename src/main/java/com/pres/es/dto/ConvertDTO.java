package com.pres.es.dto;

/**
 * @author Dora
 * @date 2019/10/25 9:18
 **/
public interface ConvertDTO<S, T> {
    /**
     * 转换
     *
     * @return
     * @author dora
     * @date 2019/10/25
     **/
    T doForward(S source);
    /**
     *
     * @author dora
     * @return
     * @date 2019/10/25
    **/
    S doBackward(T source);

}

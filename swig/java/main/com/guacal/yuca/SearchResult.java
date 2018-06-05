/**
 * MIT License
 * <p>
 * Copyright (c) 2016-2018 Angel Leon, Alden Torres
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */


package com.guacal.yuca;

import com.guacal.yuca.swig.SWIGTYPE_p_std__shared_ptrT_yuca__SearchRequest_t;

public class SearchResult {
    private final com.guacal.yuca.swig.SearchResult swig;
    private final double score;
    private final int id;
    private final SearchRequest sr;
    private final Document document;

    public SearchResult(com.guacal.yuca.swig.SearchResult swigSearchResult) {
        swig = swigSearchResult;
        score = swig.getScore();
        id = swig.getId();
        sr = new SearchRequest(swig.getSearchRequest());
        document = new Document(swig.getDocument());
    }

    public double getScore() {
        return score;
    }

    public int getId() {
        return id;
    }

    public SearchRequest getSearchRequest() {
        return sr;
    }

    public Document getDocument() {
        return document;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SearchResult)) {
            return false;
        }
        return swig.op_eq(((SearchResult)obj).swig);
    }
}

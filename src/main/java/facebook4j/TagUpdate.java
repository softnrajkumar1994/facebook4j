/*
 * Copyright 2012 Ryuji Yamashita
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package facebook4j;

import java.util.ArrayList;
import java.util.List;

import facebook4j.internal.http.HttpParameter;

/**
 * @author Ryuji Yamashita - roundrop at gmail.com
 */
public class TagUpdate implements java.io.Serializable {
    private static final long serialVersionUID = -8565099471826935282L;

    private String tagText;
    private Integer x;
    private Integer y;

    public TagUpdate() {
    }

    public TagUpdate(String tagText) {
        this.tagText = tagText;
    }

    public TagUpdate(String tagText, Integer x, Integer y) {
        this.tagText = tagText;
        this.x = x;
        this.y = y;
    }

    public String getTagText() {
        return tagText;
    }

    public void setTagText(String tagText) {
        this.tagText = tagText;
    }
    
    public TagUpdate tagText(String tagText) {
        setTagText(tagText);
        return this;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
    
    public TagUpdate x(Integer x) {
        setX(x);
        return this;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
    
    public TagUpdate y(Integer y) {
        setY(y);
        return this;
    }

    /*package*/ HttpParameter[] asHttpParameterArray() {
        List<HttpParameter> params = new ArrayList<HttpParameter>();
        if (tagText != null) {
            params.add(new HttpParameter("tag_text", tagText));
        }
        if (x != null) {
            params.add(new HttpParameter("x", x));
        }
        if (y != null) {
            params.add(new HttpParameter("y", y));
        }
        return params.toArray(new HttpParameter[params.size()]);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tagText == null) ? 0 : tagText.hashCode());
        result = prime * result + ((x == null) ? 0 : x.hashCode());
        result = prime * result + ((y == null) ? 0 : y.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TagUpdate other = (TagUpdate) obj;
        if (tagText == null) {
            if (other.tagText != null)
                return false;
        } else if (!tagText.equals(other.tagText))
            return false;
        if (x == null) {
            if (other.x != null)
                return false;
        } else if (!x.equals(other.x))
            return false;
        if (y == null) {
            if (other.y != null)
                return false;
        } else if (!y.equals(other.y))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TagUpdate [tagText=" + tagText + ", x=" + x + ", y=" + y + "]";
    }

}

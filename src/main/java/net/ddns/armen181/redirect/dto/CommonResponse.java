package net.ddns.armen181.redirect.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CommonResponse {
    @JsonProperty("success")
    private int success;

    @JsonProperty("error")
    private String error;

    public CommonResponse() {
        super();
    }

    public CommonResponse(final int success, final String error) {
        this.success = success;
        this.error = error;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(final int success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof CommonResponse)) {
            return false;
        }

        final CommonResponse that = (CommonResponse) o;

        return new EqualsBuilder()
                .append(success, that.success)
                .append(error, that.error)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(success)
                .append(error)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("success", success)
                .append("error", error)
                .toString();
    }
}

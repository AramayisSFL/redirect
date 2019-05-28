package net.ddns.armen181.redirect.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class TranslationStreamResponse extends CommonResponse {

    private String type;

    private String source;

    public TranslationStreamResponse() {
        super();
    }

    public TranslationStreamResponse(final int success, final String error, final String type, final String source) {
        super(success, error);
        this.type = type;
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(final String source) {
        this.source = source;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof TranslationStreamResponse)) {
            return false;
        }

        final TranslationStreamResponse that = (TranslationStreamResponse) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(type, that.type)
                .append(source, that.source)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(type)
                .append(source)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("type", type)
                .append("source", source)
                .toString();
    }
}

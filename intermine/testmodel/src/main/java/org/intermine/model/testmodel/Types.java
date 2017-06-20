package org.intermine.model.testmodel;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;

public class Types implements org.intermine.model.InterMineObject
{
    // Attr: org.intermine.model.testmodel.Types.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.testmodel.Types.booleanType
    protected boolean booleanType;
    public boolean getBooleanType() { return booleanType; }
    public void setBooleanType(final boolean booleanType) { this.booleanType = booleanType; }

    // Attr: org.intermine.model.testmodel.Types.floatType
    protected float floatType;
    public float getFloatType() { return floatType; }
    public void setFloatType(final float floatType) { this.floatType = floatType; }

    // Attr: org.intermine.model.testmodel.Types.doubleType
    protected double doubleType;
    public double getDoubleType() { return doubleType; }
    public void setDoubleType(final double doubleType) { this.doubleType = doubleType; }

    // Attr: org.intermine.model.testmodel.Types.shortType
    protected short shortType;
    public short getShortType() { return shortType; }
    public void setShortType(final short shortType) { this.shortType = shortType; }

    // Attr: org.intermine.model.testmodel.Types.intType
    protected int intType;
    public int getIntType() { return intType; }
    public void setIntType(final int intType) { this.intType = intType; }

    // Attr: org.intermine.model.testmodel.Types.longType
    protected long longType;
    public long getLongType() { return longType; }
    public void setLongType(final long longType) { this.longType = longType; }

    // Attr: org.intermine.model.testmodel.Types.booleanObjType
    protected java.lang.Boolean booleanObjType;
    public java.lang.Boolean getBooleanObjType() { return booleanObjType; }
    public void setBooleanObjType(final java.lang.Boolean booleanObjType) { this.booleanObjType = booleanObjType; }

    // Attr: org.intermine.model.testmodel.Types.floatObjType
    protected java.lang.Float floatObjType;
    public java.lang.Float getFloatObjType() { return floatObjType; }
    public void setFloatObjType(final java.lang.Float floatObjType) { this.floatObjType = floatObjType; }

    // Attr: org.intermine.model.testmodel.Types.doubleObjType
    protected java.lang.Double doubleObjType;
    public java.lang.Double getDoubleObjType() { return doubleObjType; }
    public void setDoubleObjType(final java.lang.Double doubleObjType) { this.doubleObjType = doubleObjType; }

    // Attr: org.intermine.model.testmodel.Types.shortObjType
    protected java.lang.Short shortObjType;
    public java.lang.Short getShortObjType() { return shortObjType; }
    public void setShortObjType(final java.lang.Short shortObjType) { this.shortObjType = shortObjType; }

    // Attr: org.intermine.model.testmodel.Types.intObjType
    protected java.lang.Integer intObjType;
    public java.lang.Integer getIntObjType() { return intObjType; }
    public void setIntObjType(final java.lang.Integer intObjType) { this.intObjType = intObjType; }

    // Attr: org.intermine.model.testmodel.Types.longObjType
    protected java.lang.Long longObjType;
    public java.lang.Long getLongObjType() { return longObjType; }
    public void setLongObjType(final java.lang.Long longObjType) { this.longObjType = longObjType; }

    // Attr: org.intermine.model.testmodel.Types.bigDecimalObjType
    protected java.math.BigDecimal bigDecimalObjType;
    public java.math.BigDecimal getBigDecimalObjType() { return bigDecimalObjType; }
    public void setBigDecimalObjType(final java.math.BigDecimal bigDecimalObjType) { this.bigDecimalObjType = bigDecimalObjType; }

    // Attr: org.intermine.model.testmodel.Types.dateObjType
    protected java.util.Date dateObjType;
    public java.util.Date getDateObjType() { return dateObjType; }
    public void setDateObjType(final java.util.Date dateObjType) { this.dateObjType = dateObjType; }

    // Attr: org.intermine.model.testmodel.Types.stringObjType
    protected java.lang.String stringObjType;
    public java.lang.String getStringObjType() { return stringObjType; }
    public void setStringObjType(final java.lang.String stringObjType) { this.stringObjType = stringObjType; }

    // Attr: org.intermine.model.testmodel.Types.clobObjType
    protected org.intermine.objectstore.query.ClobAccess clobObjType;
    public org.intermine.objectstore.query.ClobAccess getClobObjType() { return clobObjType; }
    public void setClobObjType(final org.intermine.objectstore.query.ClobAccess clobObjType) { this.clobObjType = clobObjType; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Types && id != null) ? id.equals(((Types)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Types [bigDecimalObjType=" + (bigDecimalObjType == null ? "null" : "\"" + bigDecimalObjType + "\"") + ", booleanObjType=" + (booleanObjType == null ? "null" : "\"" + booleanObjType + "\"") + ", booleanType=" + booleanType + ", clobObjType=" + (clobObjType == null ? "null" : "\"" + clobObjType + "\"") + ", dateObjType=" + (dateObjType == null ? "null" : "\"" + dateObjType + "\"") + ", doubleObjType=" + doubleObjType + ", doubleType=" + doubleType + ", floatObjType=" + floatObjType + ", floatType=" + floatType + ", id=" + id + ", intObjType=" + intObjType + ", intType=" + intType + ", longObjType=" + longObjType + ", longType=" + longType + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", shortObjType=" + shortObjType + ", shortType=" + shortType + ", stringObjType=" + (stringObjType == null ? "null" : "\"" + stringObjType + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("booleanType".equals(fieldName)) {
            return Boolean.valueOf(booleanType);
        }
        if ("floatType".equals(fieldName)) {
            return Float.valueOf(floatType);
        }
        if ("doubleType".equals(fieldName)) {
            return Double.valueOf(doubleType);
        }
        if ("shortType".equals(fieldName)) {
            return Short.valueOf(shortType);
        }
        if ("intType".equals(fieldName)) {
            return Integer.valueOf(intType);
        }
        if ("longType".equals(fieldName)) {
            return Long.valueOf(longType);
        }
        if ("booleanObjType".equals(fieldName)) {
            return booleanObjType;
        }
        if ("floatObjType".equals(fieldName)) {
            return floatObjType;
        }
        if ("doubleObjType".equals(fieldName)) {
            return doubleObjType;
        }
        if ("shortObjType".equals(fieldName)) {
            return shortObjType;
        }
        if ("intObjType".equals(fieldName)) {
            return intObjType;
        }
        if ("longObjType".equals(fieldName)) {
            return longObjType;
        }
        if ("bigDecimalObjType".equals(fieldName)) {
            return bigDecimalObjType;
        }
        if ("dateObjType".equals(fieldName)) {
            return dateObjType;
        }
        if ("stringObjType".equals(fieldName)) {
            return stringObjType;
        }
        if ("clobObjType".equals(fieldName)) {
            return clobObjType;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.testmodel.Types.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("booleanType".equals(fieldName)) {
            return Boolean.valueOf(booleanType);
        }
        if ("floatType".equals(fieldName)) {
            return Float.valueOf(floatType);
        }
        if ("doubleType".equals(fieldName)) {
            return Double.valueOf(doubleType);
        }
        if ("shortType".equals(fieldName)) {
            return Short.valueOf(shortType);
        }
        if ("intType".equals(fieldName)) {
            return Integer.valueOf(intType);
        }
        if ("longType".equals(fieldName)) {
            return Long.valueOf(longType);
        }
        if ("booleanObjType".equals(fieldName)) {
            return booleanObjType;
        }
        if ("floatObjType".equals(fieldName)) {
            return floatObjType;
        }
        if ("doubleObjType".equals(fieldName)) {
            return doubleObjType;
        }
        if ("shortObjType".equals(fieldName)) {
            return shortObjType;
        }
        if ("intObjType".equals(fieldName)) {
            return intObjType;
        }
        if ("longObjType".equals(fieldName)) {
            return longObjType;
        }
        if ("bigDecimalObjType".equals(fieldName)) {
            return bigDecimalObjType;
        }
        if ("dateObjType".equals(fieldName)) {
            return dateObjType;
        }
        if ("stringObjType".equals(fieldName)) {
            return stringObjType;
        }
        if ("clobObjType".equals(fieldName)) {
            return clobObjType;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.testmodel.Types.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("booleanType".equals(fieldName)) {
            booleanType = ((Boolean) value).booleanValue();
        } else if ("floatType".equals(fieldName)) {
            floatType = ((Float) value).floatValue();
        } else if ("doubleType".equals(fieldName)) {
            doubleType = ((Double) value).doubleValue();
        } else if ("shortType".equals(fieldName)) {
            shortType = ((Short) value).shortValue();
        } else if ("intType".equals(fieldName)) {
            intType = ((Integer) value).intValue();
        } else if ("longType".equals(fieldName)) {
            longType = ((Long) value).longValue();
        } else if ("booleanObjType".equals(fieldName)) {
            booleanObjType = (java.lang.Boolean) value;
        } else if ("floatObjType".equals(fieldName)) {
            floatObjType = (java.lang.Float) value;
        } else if ("doubleObjType".equals(fieldName)) {
            doubleObjType = (java.lang.Double) value;
        } else if ("shortObjType".equals(fieldName)) {
            shortObjType = (java.lang.Short) value;
        } else if ("intObjType".equals(fieldName)) {
            intObjType = (java.lang.Integer) value;
        } else if ("longObjType".equals(fieldName)) {
            longObjType = (java.lang.Long) value;
        } else if ("bigDecimalObjType".equals(fieldName)) {
            bigDecimalObjType = (java.math.BigDecimal) value;
        } else if ("dateObjType".equals(fieldName)) {
            dateObjType = (java.util.Date) value;
        } else if ("stringObjType".equals(fieldName)) {
            stringObjType = (java.lang.String) value;
        } else if ("clobObjType".equals(fieldName)) {
            clobObjType = (org.intermine.objectstore.query.ClobAccess) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.testmodel.Types.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("booleanType".equals(fieldName)) {
            return Boolean.TYPE;
        }
        if ("floatType".equals(fieldName)) {
            return Float.TYPE;
        }
        if ("doubleType".equals(fieldName)) {
            return Double.TYPE;
        }
        if ("shortType".equals(fieldName)) {
            return Short.TYPE;
        }
        if ("intType".equals(fieldName)) {
            return Integer.TYPE;
        }
        if ("longType".equals(fieldName)) {
            return Long.TYPE;
        }
        if ("booleanObjType".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("floatObjType".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("doubleObjType".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("shortObjType".equals(fieldName)) {
            return java.lang.Short.class;
        }
        if ("intObjType".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("longObjType".equals(fieldName)) {
            return java.lang.Long.class;
        }
        if ("bigDecimalObjType".equals(fieldName)) {
            return java.math.BigDecimal.class;
        }
        if ("dateObjType".equals(fieldName)) {
            return java.util.Date.class;
        }
        if ("stringObjType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("clobObjType".equals(fieldName)) {
            return org.intermine.objectstore.query.ClobAccess.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.testmodel.Types.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.testmodel.Types.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.testmodel.Types.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.testmodel.Types");
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        sb.append("$_^abooleanType$_^").append(booleanType);
        sb.append("$_^afloatType$_^").append(floatType);
        sb.append("$_^adoubleType$_^").append(doubleType);
        sb.append("$_^ashortType$_^").append(shortType);
        sb.append("$_^aintType$_^").append(intType);
        sb.append("$_^alongType$_^").append(longType);
        if (booleanObjType != null) {
            sb.append("$_^abooleanObjType$_^").append(booleanObjType);
        }
        if (floatObjType != null) {
            sb.append("$_^afloatObjType$_^").append(floatObjType);
        }
        if (doubleObjType != null) {
            sb.append("$_^adoubleObjType$_^").append(doubleObjType);
        }
        if (shortObjType != null) {
            sb.append("$_^ashortObjType$_^").append(shortObjType);
        }
        if (intObjType != null) {
            sb.append("$_^aintObjType$_^").append(intObjType);
        }
        if (longObjType != null) {
            sb.append("$_^alongObjType$_^").append(longObjType);
        }
        if (bigDecimalObjType != null) {
            sb.append("$_^abigDecimalObjType$_^").append(bigDecimalObjType);
        }
        if (dateObjType != null) {
            sb.append("$_^adateObjType$_^").append(dateObjType.getTime());
        }
        if (stringObjType != null) {
            sb.append("$_^astringObjType$_^");
            String string = stringObjType;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (clobObjType != null) {
            sb.append("$_^aclobObjType$_^" + clobObjType.getDbDescription());
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.testmodel.Types.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.testmodel.Types)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "abooleanType".equals(notXml[i])) {
                i++;
                booleanType = Boolean.parseBoolean(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "afloatType".equals(notXml[i])) {
                i++;
                floatType = Float.parseFloat(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "adoubleType".equals(notXml[i])) {
                i++;
                doubleType = Double.parseDouble(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ashortType".equals(notXml[i])) {
                i++;
                shortType = Short.parseShort(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aintType".equals(notXml[i])) {
                i++;
                intType = Integer.parseInt(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "alongType".equals(notXml[i])) {
                i++;
                longType = Long.parseLong(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "abooleanObjType".equals(notXml[i])) {
                i++;
                booleanObjType = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "afloatObjType".equals(notXml[i])) {
                i++;
                floatObjType = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "adoubleObjType".equals(notXml[i])) {
                i++;
                doubleObjType = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ashortObjType".equals(notXml[i])) {
                i++;
                shortObjType = Short.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aintObjType".equals(notXml[i])) {
                i++;
                intObjType = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "alongObjType".equals(notXml[i])) {
                i++;
                longObjType = Long.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "abigDecimalObjType".equals(notXml[i])) {
                i++;
                bigDecimalObjType = new java.math.BigDecimal(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "adateObjType".equals(notXml[i])) {
                i++;
                dateObjType = new java.util.Date(Long.parseLong(notXml[i]));
                i++;
            }
            if ((i < notXml.length) && "astringObjType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                stringObjType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aclobObjType".equals(notXml[i])) {
                i++;
                clobObjType = org.intermine.objectstore.query.ClobAccess.decodeDbDescription(os, notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.testmodel.Types.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.testmodel.Types.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.testmodel.Types.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
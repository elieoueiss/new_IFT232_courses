/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_courses", catalog = "courses", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblCourses.findAll", query = "SELECT t FROM TblCourses t"),
    @NamedQuery(name = "TblCourses.findByIDcourses", query = "SELECT t FROM TblCourses t WHERE t.iDcourses = :iDcourses"),
    @NamedQuery(name = "TblCourses.findByCode", query = "SELECT t FROM TblCourses t WHERE t.code = :code"),
    @NamedQuery(name = "TblCourses.findByName", query = "SELECT t FROM TblCourses t WHERE t.name = :name"),
    @NamedQuery(name = "TblCourses.findByDecription", query = "SELECT t FROM TblCourses t WHERE t.decription = :decription"),
    @NamedQuery(name = "TblCourses.findByType", query = "SELECT t FROM TblCourses t WHERE t.type = :type"),
    @NamedQuery(name = "TblCourses.findByNumberofcredit", query = "SELECT t FROM TblCourses t WHERE t.numberofcredit = :numberofcredit"),
    @NamedQuery(name = "TblCourses.findByLab", query = "SELECT t FROM TblCourses t WHERE t.lab = :lab")})
public class TblCourses implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_courses")
    private Integer iDcourses;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Column(name = "decription")
    private String decription;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "numberofcredit")
    private int numberofcredit;
    @Basic(optional = false)
    @Column(name = "Lab")
    private String lab;

    public TblCourses() {
    }

    public TblCourses(Integer iDcourses) {
        this.iDcourses = iDcourses;
    }

    public TblCourses(Integer iDcourses, String code, String name, String type, int numberofcredit, String lab) {
        this.iDcourses = iDcourses;
        this.code = code;
        this.name = name;
        this.type = type;
        this.numberofcredit = numberofcredit;
        this.lab = lab;
    }

    public Integer getIDcourses() {
        return iDcourses;
    }

    public void setIDcourses(Integer iDcourses) {
        Integer oldIDcourses = this.iDcourses;
        this.iDcourses = iDcourses;
        changeSupport.firePropertyChange("IDcourses", oldIDcourses, iDcourses);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        String oldCode = this.code;
        this.code = code;
        changeSupport.firePropertyChange("code", oldCode, code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        String oldDecription = this.decription;
        this.decription = decription;
        changeSupport.firePropertyChange("decription", oldDecription, decription);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public int getNumberofcredit() {
        return numberofcredit;
    }

    public void setNumberofcredit(int numberofcredit) {
        int oldNumberofcredit = this.numberofcredit;
        this.numberofcredit = numberofcredit;
        changeSupport.firePropertyChange("numberofcredit", oldNumberofcredit, numberofcredit);
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        String oldLab = this.lab;
        this.lab = lab;
        changeSupport.firePropertyChange("lab", oldLab, lab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDcourses != null ? iDcourses.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCourses)) {
            return false;
        }
        TblCourses other = (TblCourses) object;
        if ((this.iDcourses == null && other.iDcourses != null) || (this.iDcourses != null && !this.iDcourses.equals(other.iDcourses))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "courses.TblCourses[ iDcourses=" + iDcourses + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

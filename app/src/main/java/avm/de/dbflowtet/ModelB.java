package avm.de.dbflowtet;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ContainerAdapter;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * (c) AVM Berlin
 * Date: 23.03.2015
 * Time: 10:18
 */
@Table(databaseName = AppDatabase.NAME)
@ContainerAdapter
public class ModelB extends BaseModel {

    @Column(columnType = Column.PRIMARY_KEY)
    int id;

    @Column
    String address;

    @Column(columnType = Column.FOREIGN_KEY,
            references = {@ForeignKeyReference(columnName = "modelC", foreignColumnName = "id", columnType = Integer.class)},
            saveForeignKeyModel = true)
    ModelC modelC;

    public ModelB() {}

    public ModelB(String address, ModelC modelC) {
        this.address = address;
        this.modelC = modelC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ModelC getModelC() {
        return modelC;
    }

    public void setModelC(ModelC modelC) {
        this.modelC = modelC;
    }
}

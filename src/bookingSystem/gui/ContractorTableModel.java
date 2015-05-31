///*------------------------------------------------------------------------------
// *******************************************************************************
// * COPYRIGHT Ericsson 2013
// *
// * The copyright to the computer program(s) herein is the property of
// * Ericsson Inc. The programs may be used and/or copied only with written
// * permission from Ericsson Inc. or in accordance with the terms and
// * conditions stipulated in the agreement/contract under which the
// * program(s) have been supplied.
// *******************************************************************************
// *----------------------------------------------------------------------------*/
//package bookingSystem.gui;
//
//import java.util.Vector;
//
//import javax.swing.table.AbstractTableModel;
//
//import bookingSystem.main.Contractor;
//
//// TODO: http://www.javalobby.org/articles/jtable/?source=archives
//public class ContractorTableModel extends AbstractTableModel {
//
//    //TODO: Change these to an enum??
//    public static final int ID_INDEX = 0;
//    public static final int NAME_INDEX = 1;
//    public static final int OWNER_INDEX = 2;
//    public static final int ADDRESS_INDEX = 3;
//    public static final int RATE_INDEX = 4;
//
//    protected String[] columnNames;
//    protected Vector<Contractor> dataVector;
//
//    public ContractorTableModel(String[] columnNames) {
//        this.columnNames = columnNames;
//        dataVector = new Vector<Contractor>();
//    }
//
//    /*
//     * Returns the column name.
//     */
//    @Override
//    public String getColumnName(int column) {
//        return columnNames[column];
//    }
//
//    /*
//     * TODO: make column class. would improve switch statement below because we wouldn't have to return by default. This method (getColumnClass) could
//     * return void. and the return could instead be a setClass method!
//     */
//    @Override
//    public Class getColumnClass(int column) {
//        switch (column) {
//            case ID_INDEX:
//                //                TODO: should return int;
//            case NAME_INDEX:
//            case OWNER_INDEX:
//            case ADDRESS_INDEX:
//            case RATE_INDEX:
//                //              TODO: should return int;
//                return String.class;
//            default:
//                return Object.class;
//        }
//    }
//
//    @Override
//    public Object getValueAt(int row, int column) {
//        Contractor contractor = dataVector.get(row);
//        switch (column) {
//            case ID_INDEX:
//                return contractor.getId();
//            case NAME_INDEX:
//                return contractor.getName();
//            case OWNER_INDEX:
//                return contractor.getOwner();
//            case ADDRESS_INDEX:
//                return contractor.getAddress();
//            case RATE_INDEX:
//                return contractor.getRate();
//            default:
//                return new Object();
//        }
//    }
//
//    @Override
//    public void setValueAt(Object value, int row, int column) {
//        Contractor contractor = dataVector.get(row);
//        switch (column) {
//            case ID_INDEX:
//                contractor.setId((String) value);
//                break;
//            case NAME_INDEX:
//                contractor.setName((String) value);
//                break;
//            case OWNER_INDEX:
//                contractor.setOwner((String) value);
//                break;
//            case ADDRESS_INDEX:
//                contractor.setAddress((String) value);
//                break;
//            case RATE_INDEX:
//                contractor.setRate((String) value);
//                break;
//            default:
//                System.out.println("Invalid index");
//        }
//    }
//
//    @Override
//    public int getRowCount() {
//        return dataVector.size();
//    }
//
//    @Override
//    public int getColumnCount() {
//        return columnNames.length;
//    }
//
//}

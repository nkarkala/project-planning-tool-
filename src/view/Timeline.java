/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import entity.Budget;
import entity.MemberProject;
import entity.Project;
import entity.Task;
import java.awt.BorderLayout;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JScrollPane;
import org.jdesktop.swingx.autocomplete.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import static view.GanttChart.createDataset;


/**
 *
 * @author niki
 */
public class Timeline extends javax.swing.JPanel {

    /**
     * Creates new form Timeline
     */
    public Timeline() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        PersistenceUnitEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("PersistenceUnit").createEntityManager();
        projectQuery = java.beans.Beans.isDesignTime() ? null : PersistenceUnitEntityManager.createQuery("SELECT p.projectName FROM Project p");
        projectList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : projectQuery.getResultList();
        projectName = new org.jdesktop.swingx.JXComboBox();
        goButton = new javax.swing.JButton();
        chartPane = new javax.swing.JTabbedPane();
        ganttPane = new javax.swing.JPanel();
        pieChartPane = new javax.swing.JPanel();
        budgetPane = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        progressLabel = new javax.swing.JLabel();

        AutoCompleteDecorator.decorate(projectName);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${resultList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, projectQuery, eLProperty, projectName);
        bindingGroup.addBinding(jComboBoxBinding);

        goButton.setText("GO");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ganttPaneLayout = new javax.swing.GroupLayout(ganttPane);
        ganttPane.setLayout(ganttPaneLayout);
        ganttPaneLayout.setHorizontalGroup(
            ganttPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        ganttPaneLayout.setVerticalGroup(
            ganttPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        chartPane.addTab("Gantt Chart", ganttPane);

        javax.swing.GroupLayout pieChartPaneLayout = new javax.swing.GroupLayout(pieChartPane);
        pieChartPane.setLayout(pieChartPaneLayout);
        pieChartPaneLayout.setHorizontalGroup(
            pieChartPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        pieChartPaneLayout.setVerticalGroup(
            pieChartPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        chartPane.addTab("Task Distribution", pieChartPane);

        javax.swing.GroupLayout budgetPaneLayout = new javax.swing.GroupLayout(budgetPane);
        budgetPane.setLayout(budgetPaneLayout);
        budgetPaneLayout.setHorizontalGroup(
            budgetPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        budgetPaneLayout.setVerticalGroup(
            budgetPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        chartPane.addTab("Budget", budgetPane);

        progressBar.setStringPainted(true);

        progressLabel.setText("Project Progress");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(chartPane)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(projectName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(goButton))
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goButton))
                .addGap(18, 18, 18)
                .addComponent(progressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chartPane, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        createGanttChart();
        setProgressBar();
        createPieChart();
        createBudgetChart();
        
    }//GEN-LAST:event_goButtonActionPerformed
    public void  createGanttChart(){
        GanttChart g=new GanttChart("Demo");
        GanttChart.setProject(projectName.getSelectedItem().toString());
        final IntervalCategoryDataset dataset = GanttChart.createDataset();
        final JFreeChart chart = g.createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        ganttPane.removeAll();
        ganttPane.setLayout(new BorderLayout());
        ganttPane.add(chartPanel);
        ganttPane.revalidate();
        ganttPane.repaint();
    }
    public void setProgressBar(){
        String pname=projectName.getSelectedItem().toString();
        String PERSISTENCE_UNIT_NAME = "PersistenceUnit";      
        EntityManagerFactory factory;   
        EntityManager manager;	
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        manager = factory.createEntityManager();
        TypedQuery<Task> query = manager.createQuery("SELECT e FROM Task e where e.projectName=:project and e.taskStatus=\"Completed\"", entity.Task.class);
        query.setParameter("project",pname);
        List<entity.Task> result =  query.getResultList();
        int num_completed=result.size();
        System.out.println(num_completed);
        query = manager.createQuery("SELECT e FROM Task e where e.projectName=:project and e.taskStatus=\"In Progress\"", entity.Task.class);
        query.setParameter("project",pname );
        result =  query.getResultList();
     
        int num_in_progress=result.size();
        System.out.println(num_in_progress);
        int per=(int) ((num_completed*1.0/(num_in_progress + num_completed))*100.0);
        progressBar.setValue(per);

    }
    public void createPieChart(){
       DefaultPieDataset piedataset = new DefaultPieDataset();
       String PERSISTENCE_UNIT_NAME = "PersistenceUnit";      
       EntityManagerFactory factory;   
       EntityManager manager;	
       factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
       manager = factory.createEntityManager();
       TypedQuery<MemberProject> query = manager.createQuery("SELECT e FROM MemberProject e where e.memberProjectPK.projectName=:project", entity.MemberProject.class);
       query.setParameter("project",projectName.getSelectedItem().toString() );
       List<entity.MemberProject> result =  query.getResultList();
       for(int i=0;i<result.size();i++){
           TypedQuery<Task> query3=manager.createNamedQuery("Task.findByUserId",Task.class);
           System.out.println(result.get(i));
           String user=result.get(i).getUserID();
           query3.setParameter("userId", user);
           List<entity.Task> result3 =  query3.getResultList();
           System.out.println(result3);
           piedataset.setValue(result.get(i).getUserID(), result3.size());  

       }
       
       JFreeChart piechart = ChartFactory.createPieChart(  
         "Work Distribution",   // Title  
         piedataset,             // Dataset  
         true,                   // Show legend  
         true,                   // Use tooltips  
         false                   // Generate URLs  
      ); 
      ChartPanel chartPanel = new ChartPanel(piechart);
      pieChartPane.removeAll();
      pieChartPane.setLayout(new BorderLayout());
      pieChartPane.add(chartPanel);
      pieChartPane.revalidate();
      pieChartPane.repaint();
    }
    public void createBudgetChart(){
       DefaultPieDataset piedataset = new DefaultPieDataset();
       String PERSISTENCE_UNIT_NAME = "PersistenceUnit";      
       EntityManagerFactory factory;   
       EntityManager manager;	
       factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
       manager = factory.createEntityManager();
       TypedQuery<Budget> query = manager.createQuery("SELECT e FROM budget e where  e.project_id=:project", entity.Budget.class);
       query.setParameter("project",projectName.getSelectedItem().toString() );
       List<Budget> result =  query.getResultList();
       for(int i=0;i<result.size();i++){
           System.out.println(Integer.parseInt(result.get(i).getestimated_cost()));
           piedataset.setValue(result.get(i).getitem_name(), Integer.parseInt(result.get(i).getestimated_cost()));  

       }
       JFreeChart piechart = ChartFactory.createPieChart(  
         "Budget ",   // Title  
         piedataset,             // Dataset  
         true,                   // Show legend  
         true,                   // Use tooltips  
         false                   // Generate URLs  
      ); 
      ChartPanel chartPanel = new ChartPanel(piechart);
      budgetPane.removeAll();
      budgetPane.setLayout(new BorderLayout());
      budgetPane.add(chartPanel);
      budgetPane.revalidate();
      budgetPane.repaint();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager PersistenceUnitEntityManager;
    private javax.swing.JPanel budgetPane;
    private javax.swing.JTabbedPane chartPane;
    private javax.swing.JPanel ganttPane;
    private javax.swing.JButton goButton;
    private javax.swing.JPanel pieChartPane;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLabel;
    private java.util.List<entity.Project> projectList;
    private org.jdesktop.swingx.JXComboBox projectName;
    private javax.persistence.Query projectQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

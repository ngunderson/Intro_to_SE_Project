package GUI;
import HelperClasses.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**

 @author gundersonn
 */
public class EnsemblePage extends javax.swing.JFrame
{
   private static Ensemble thisEnsemble;
   private static MusicNetwork network;
   /**
    Creates new form EnsemblePage
    */
   public EnsemblePage( Ensemble e, MusicNetwork _network )
   {
      initComponents();
      thisEnsemble = e;
      network = _network;
      NameLabel.setText(thisEnsemble.getName());
      DirectorLabel.setText(thisEnsemble.getDirector().getName());
      UpcomingEventsJlist.setListData(thisEnsemble.getEvents());
      MessageJList.setListData(thisEnsemble.messages);
      if ( network.getCurrentUser() instanceof Director )
      {
         AddEventButton.setVisible(true);
         jLabel5.setVisible(true);
         jLabel6.setVisible(true);
         jLabel7.setVisible(true);
         jLabel8.setVisible(true);
         NameTextBox.setVisible(true);
         LocationTextBox.setVisible(true);
         TimeTextBox.setVisible(true);
         
      }
      else
      {
         AddEventButton.setVisible(false);
         jLabel5.setVisible(false);
         jLabel6.setVisible(false);
         jLabel7.setVisible(false);
         jLabel8.setVisible(false);
         NameTextBox.setVisible(false);
         LocationTextBox.setVisible(false);
         TimeTextBox.setVisible(false);     
      }
      UpcomingEventsJlist.addMouseListener(new MouseAdapter() {
         public void mouseClicked( MouseEvent evt ){
            if( evt.getClickCount() == 2 ){
               DoubleClickEventJlistActionPerformed(evt);
            }
         }
      });
   }

   /**
    This method is called from within the constructor to initialize the form.
    WARNING: Do NOT modify this code. The content of this method is always
    regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jLabel1 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      NameLabel = new javax.swing.JLabel();
      JLabel2 = new javax.swing.JLabel();
      DirectorLabel = new javax.swing.JLabel();
      jPanel3 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      EnsemblesJlist = new javax.swing.JList();
      jLabel3 = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      UpcomingEventsJlist = new javax.swing.JList();
      UploadorDownloadButton = new javax.swing.JButton();
      AddEventButton = new javax.swing.JButton();
      jLabel4 = new javax.swing.JLabel();
      jScrollPane3 = new javax.swing.JScrollPane();
      MessageJList = new javax.swing.JList();
      MessageTextBox = new javax.swing.JTextField();
      PostButton = new javax.swing.JButton();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      NameTextBox = new javax.swing.JTextField();
      LocationTextBox = new javax.swing.JTextField();
      TimeTextBox = new javax.swing.JTextField();
      ErrorLabel = new javax.swing.JLabel();

      jLabel1.setText("jLabel1");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(255, 204, 102));

      jPanel2.setBackground(new java.awt.Color(255, 204, 102));

      NameLabel.setFont(new java.awt.Font("Wide Latin", 0, 30)); // NOI18N
      NameLabel.setText("Name");

      JLabel2.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
      JLabel2.setText("Directed By ");

      DirectorLabel.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
      DirectorLabel.setText("Directed By ");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
            .addContainerGap())
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(JLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(DirectorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(JLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(DirectorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );

      jPanel3.setBackground(new java.awt.Color(255, 153, 0));

      jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
      jLabel2.setText("Message Board");

      EnsemblesJlist.setModel(new javax.swing.AbstractListModel()
      {
         String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
         public int getSize() { return strings.length; }
         public Object getElementAt(int i) { return strings[i]; }
      });
      jScrollPane1.setViewportView(EnsemblesJlist);

      jLabel3.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
      jLabel3.setText("Upcoming Events");

      UpcomingEventsJlist.setModel(new javax.swing.AbstractListModel()
      {
         String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
         public int getSize() { return strings.length; }
         public Object getElementAt(int i) { return strings[i]; }
      });
      jScrollPane2.setViewportView(UpcomingEventsJlist);

      UploadorDownloadButton.setBackground(new java.awt.Color(153, 153, 255));
      UploadorDownloadButton.setText("Upload/Download");

      AddEventButton.setBackground(new java.awt.Color(153, 153, 255));
      AddEventButton.setText("Add");
      AddEventButton.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            AddEventButtonActionPerformed(evt);
         }
      });

      jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
      jLabel4.setText("Files");

      MessageJList.setModel(new javax.swing.AbstractListModel()
      {
         String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
         public int getSize() { return strings.length; }
         public Object getElementAt(int i) { return strings[i]; }
      });
      jScrollPane3.setViewportView(MessageJList);

      PostButton.setBackground(new java.awt.Color(153, 153, 255));
      PostButton.setText("Post");
      PostButton.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            PostButtonActionPerformed(evt);
         }
      });

      jLabel5.setText("Location");

      jLabel6.setText("Name");

      jLabel7.setText("Time");

      jLabel8.setText("Format - \"MM-dd-yyyy-hh-mm\"");

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap(25, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(UploadorDownloadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(MessageTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PostButton)))
                  .addGap(18, 18, 18))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(jLabel2)
                  .addGap(72, 72, 72)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(AddEventButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(NameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel5)
                           .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(LocationTextBox)
                           .addComponent(TimeTextBox)))
                     .addComponent(jScrollPane2))
                  .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
               .addComponent(ErrorLabel))
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UploadorDownloadButton))
                     .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(MessageTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(PostButton))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3)))
                  .addContainerGap())
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AddEventButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(jLabel6)
                           .addComponent(NameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(jLabel5)
                           .addComponent(LocationTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(jLabel7)
                           .addComponent(TimeTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(0, 37, Short.MAX_VALUE))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(ErrorLabel))))))
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void PostButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PostButtonActionPerformed
   {//GEN-HEADEREND:event_PostButtonActionPerformed
      thisEnsemble.messages.add( MessageTextBox.getText() );
      MessageJList.setListData( thisEnsemble.messages );
   }//GEN-LAST:event_PostButtonActionPerformed

   private void AddEventButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddEventButtonActionPerformed
   {//GEN-HEADEREND:event_AddEventButtonActionPerformed
      boolean valid = false;
      String name = NameTextBox.getText();
      String location = LocationTextBox.getText();
      String date = TimeTextBox.getText();
      if( !name.equals("") && !location.equals("") && !date.equals(""))
      {  
         StringTokenizer st = new StringTokenizer(date, "-");
         try
         {
            int month = Integer.valueOf(st.nextToken());
            int day = Integer.valueOf(st.nextToken());
            int year = Integer.valueOf(st.nextToken());
            int hour = Integer.valueOf(st.nextToken());
            int minute = Integer.valueOf(st.nextToken());
            Date d = new Date(year - 1900, month, day, hour, minute);
            Event e = new Event( location, name, d );
            thisEnsemble.addEvent(e);
            UpcomingEventsJlist.setListData(thisEnsemble.getEvents());
            valid = true;
         }
         catch( NoSuchElementException e )
         {
            valid = false;
         }
      }
      if( valid == false )
         ErrorLabel.setText("Invalid Format!");
   }//GEN-LAST:event_AddEventButtonActionPerformed

   
   private void DoubleClickEventJlistActionPerformed( MouseEvent evt)
   {
      Event e = (Event)UpcomingEventsJlist.getSelectedValue();
      EventPage p = new EventPage( e, network );
      p.pack();
      p.setVisible(true);
   }
   
   /**
    @param args the command line arguments
    */
   public static void main(String args[])
   {
      /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try
      {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
         {
            if ("Nimbus".equals(info.getName()))
            {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      }
      catch (ClassNotFoundException ex)
      {
         java.util.logging.Logger.getLogger(EnsemblePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (InstantiationException ex)
      {
         java.util.logging.Logger.getLogger(EnsemblePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (IllegalAccessException ex)
      {
         java.util.logging.Logger.getLogger(EnsemblePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (javax.swing.UnsupportedLookAndFeelException ex)
      {
         java.util.logging.Logger.getLogger(EnsemblePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            new EnsemblePage(thisEnsemble,network).setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton AddEventButton;
   private javax.swing.JLabel DirectorLabel;
   private javax.swing.JList EnsemblesJlist;
   private javax.swing.JLabel ErrorLabel;
   private javax.swing.JLabel JLabel2;
   private javax.swing.JTextField LocationTextBox;
   private javax.swing.JList MessageJList;
   private javax.swing.JTextField MessageTextBox;
   private javax.swing.JLabel NameLabel;
   private javax.swing.JTextField NameTextBox;
   private javax.swing.JButton PostButton;
   private javax.swing.JTextField TimeTextBox;
   private javax.swing.JList UpcomingEventsJlist;
   private javax.swing.JButton UploadorDownloadButton;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   // End of variables declaration//GEN-END:variables
}

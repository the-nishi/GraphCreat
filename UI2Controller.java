<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.chart.CategoryAxis?>
<?import javafx.scene.chart.LineChart?>
<?import javafx.scene.chart.NumberAxis?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>

<AnchorPane id="AnchorPane" prefHeight="481.0" prefWidth="645.0" xmlns="http://javafx.com/javafx/17" xmlns:fx="http://javafx.com/fxml/1" fx:controller="lastfxmlapplication.UI2Controller">
   <children>
      <Label fx:id="lineChartLabel" layoutX="63.0" layoutY="411.0" prefHeight="60.0" prefWidth="123.0" text="UI-2">
         <font>
            <Font size="15.0" />
         </font>
      </Label>
      <LineChart fx:id="lineChart" layoutX="33.0" layoutY="29.0" prefHeight="377.0" prefWidth="605.0" title="Monthly Supplier Payment">
        <xAxis>
          <CategoryAxis label="Month" prefHeight="32.0" prefWidth="420.0" side="BOTTOM" />
        </xAxis>
        <yAxis>
          <NumberAxis label="Tk in thousand" side="LEFT" />
        </yAxis>
      </LineChart>
      <Button fx:id="loadLineChartButton" layoutX="380.0" layoutY="429.0" mnemonicParsing="false" onAction="#loadLineChartButtonOnClick" prefHeight="25.0" prefWidth="148.0" text="Load Line Chart" />
   </children>
</AnchorPane>

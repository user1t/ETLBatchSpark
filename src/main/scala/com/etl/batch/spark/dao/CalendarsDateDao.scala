package com.etl.batch.spark.dao

import com.etl.batch.spark.connection.SparkConnection
import com.etl.batch.spark.util.Constants
import org.apache.spark.sql.{DataFrame, Row}
import org.apache.spark.streaming.dstream.DStream

class CalendarsDateDao extends Dao {
  override def getDataFrame(): DataFrame = {
    return SparkConnection.getSparkSession.read.format(Constants.FORMAT_CSV).option("header", "true").load(Constants.CALENDAR_DATES)
  }

  override def getDStream(): DStream[Row] = throw new UnsupportedOperationException
}


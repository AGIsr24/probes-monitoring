package telran.probes.service;

import telran.probes.dto.Range;

public interface RangeProviderClient {
Range getRange(long sensorId);
double MIN_DEFAULT_VALUE = -100;
double MAX_DEFAULT_VALUE =100;
}

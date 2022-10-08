export interface CapacitorAmplitudePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
